package dto;

public class AccountFactory {
    public static Account createTestAccount() {
        return new Account(
                "Test Account",
                "1234567890",
                "123456",
                "High",
                "www.test.com",
                "Test Site",
                "TST123",
                "Customer",
                "Public",
                "Technology",
                "100",
                "100000",
                "1234",
                "123 Test St",
                "Test City",
                "Test State",
                "12345",
                "USA",
                "456 Test St",
                "Test City",
                "Test State",
                "12345",
                "USA",
                "High",
                "Gold",
                "SLA123",
                "1",
                "Yes",
                "Yes",
                "Test Account Description"
        );
    }
}
