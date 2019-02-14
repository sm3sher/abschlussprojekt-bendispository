package Bendispository.Abschlussprojekt.model.transactionModels;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ConcludeTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private int lengthOfTimeframeViolation;

    private boolean timeframeViolation;

    private boolean depositIsBlocked;

    private boolean depositIsReturned;

    private boolean lenderAccepted;

    public void conclude (LeaseTransaction leaseTransaction){
        this.timeframeViolation = checkTimeFrameViolation(leaseTransaction);
    }

    private boolean checkTimeFrameViolation(LeaseTransaction leaseTransaction) {
        return false;
    }

    private ConflictTransaction cfTransaction;

    public void addConcludeTransaction(){
        ConcludeTransaction ccTrans = new ConcludeTransaction();
        checkDepositIsBlocked();
    }

    public void checkDepositIsBlocked(){

    }

    public void checkTransactionIsOk(){
        if(lenderAccepted == false){
            cfTransaction.addConflictTransaction();
        }
    }
}
