package dto;

import lombok.Builder;
import com.github.javafaker.Faker;

public class AccountFactory {

    @Builder
    public static Account fakerAccount(String rating) {
        Faker faker = new Faker();
        return new Account(faker.company().name(), faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(), rating);
    }
}
