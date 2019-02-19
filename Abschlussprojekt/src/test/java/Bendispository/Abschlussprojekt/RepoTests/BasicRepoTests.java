package Bendispository.Abschlussprojekt.RepoTests;

import Bendispository.Abschlussprojekt.model.Item;
import Bendispository.Abschlussprojekt.model.Person;
import Bendispository.Abschlussprojekt.model.Request;
import Bendispository.Abschlussprojekt.model.RequestStatus;
import Bendispository.Abschlussprojekt.model.transactionModels.LeaseTransaction;
import Bendispository.Abschlussprojekt.repos.ItemRepo;
import Bendispository.Abschlussprojekt.repos.PersonsRepo;
import Bendispository.Abschlussprojekt.repos.RequestRepo;
import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BasicRepoTests {

    @Autowired
    ItemRepo itemRepo;

    @Autowired
    PersonsRepo personsRepo;

    @Autowired
    RequestRepo requestRepo;

    @Test
    public void checkPersonRepo(){
        Person dummy1 = new Person();
        dummy1.setFirstName("Thomas");
        dummy1.setLastName("Mueller");
        dummy1.setCity("Koeln");
        dummy1.setEmail("Thomas@gmail.de");
        dummy1.setUsername("Thomu");
        dummy1.setPassword("ThomasMu");
        dummy1.setId(10L);

        personsRepo.save(dummy1);
        List<Person> testPersons = personsRepo.findAll();

        Assertions.assertThat(testPersons.get(0).getFirstName().equals("Thomas"));
        Assertions.assertThat(testPersons.get(0).getLastName().equals("Mueller"));
        Assertions.assertThat(testPersons.get(0).getCity().equals("Koeln"));
        Assertions.assertThat(testPersons.get(0).getEmail().equals("Thomas@gmail.de"));
        Assertions.assertThat(testPersons.get(0).getUsername().equals("Thomu"));
        Assertions.assertThat(testPersons.get(0).getPassword().equals("ThomasMu"));
        Assertions.assertThat(testPersons.get(0).getId().equals(10));
    }

    /*
    @Test
    public void checkItemRepo(){
        Person dummy1 = new Person();
        dummy1.setFirstName("Thomas");
        dummy1.setLastName("Mueller");
        dummy1.setCity("Koeln");
        dummy1.setEmail("Thomas@gmail.de");
        dummy1.setUsername("Thomu");
        dummy1.setPassword("ThomasMu");
        dummy1.setId(10L);

        personsRepo.save(dummy1);

        Item dummyItem1 = new Item();
        dummyItem1.setName("Schlagbohrmaschine");
        dummyItem1.setOwner(dummy1);
        dummyItem1.setDescription("Bohrt und schlägt!");
        dummyItem1.setDeposit(20);
        dummyItem1.setCostPerDay(4);
        dummyItem1.setId(20L);

        itemRepo.save(dummyItem1);
        List<Item> testItems = itemRepo.findAll();

        Assertions.assertThat(testItems.get(0).getName().equals("Schlagbohrmaschine"));
        Assertions.assertThat(testItems.get(0).getOwner().equals(dummy1));
        Assertions.assertThat(testItems.get(0).getDescription().equals("Bohrt und schlägt!"));
        Assertions.assertThat(testItems.get(0).getDeposit() == 20);
        Assertions.assertThat(testItems.get(0).getCostPerDay() == 4);
        Assertions.assertThat(testItems.get(0).getId().equals(20));
    }

    @Test
    public void checkRequestRepo(){
        Person dummy1 = new Person();
        dummy1.setFirstName("Thomas");
        dummy1.setLastName("Mueller");
        dummy1.setCity("Koeln");
        dummy1.setEmail("Thomas@gmail.de");
        dummy1.setUsername("Thomu");
        dummy1.setPassword("ThomasMu");
        dummy1.setId(10L);

        Item dummyItem1 = new Item();
        dummyItem1.setName("Schlagbohrmaschine");
        dummyItem1.setOwner(dummy1);
        dummyItem1.setDescription("Bohrt und schlägt!");
        dummyItem1.setDeposit(20);
        dummyItem1.setCostPerDay(4);
        dummyItem1.setId(20L);

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plus(1, ChronoUnit.DAYS);


        Request dummyRequest1 = new Request();
        dummyRequest1.setId(30L);
        dummyRequest1.setRequester(dummy1);
        dummyRequest1.setRequestedItem(dummyItem1);
        dummyRequest1.setDuration(7);
        dummyRequest1.setEndDate(endDate);
        dummyRequest1.setStartDate(startDate);
        dummyRequest1.setStatus(RequestStatus.PENDING);

        requestRepo.save(dummyRequest1);
        List<Request> testRequests = requestRepo.findAll();

        Assertions.assertThat(testRequests.get(0).getId().equals(30));
        Assertions.assertThat(testRequests.get(0).getRequester().equals(dummy1));
        Assertions.assertThat(testRequests.get(0).getRequestedItem().equals(dummyItem1));
        Assertions.assertThat(testRequests.get(0).getDuration() == 7);
        Assertions.assertThat(testRequests.get(0).getEndDate().equals(endDate));
        Assertions.assertThat(testRequests.get(0).getStartDate().equals(startDate));
        Assertions.assertThat(testRequests.get(0).getStatus().equals(RequestStatus.PENDING));
    }
    */
}