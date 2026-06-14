package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question11_NotificationServiceTest {

    @Test
    void shouldSendEmailNotification() {

        Question11_NotificationService service =
                new Question11_EmailNotification();

        assertEquals(
                "Email sent: Hello",
                service.send("Hello")
        );
    }

    @Test
    void shouldSendSmsNotification() {

        Question11_NotificationService service =
                new Question11_SmsNotification();

        assertEquals(
                "SMS sent: Hello",
                service.send("Hello")
        );
    }

    @Test
    void shouldSupportPolymorphism() {

        Question11_NotificationService service;

        service =
                new Question11_EmailNotification();

        assertEquals(
                "Email sent: Test",
                service.send("Test")
        );

        service =
                new Question11_SmsNotification();

        assertEquals(
                "SMS sent: Test",
                service.send("Test")
        );
    }

    @Test
    void shouldHandleEmptyMessages() {

        Question11_NotificationService service =
                new Question11_EmailNotification();

        assertEquals(
                "Email sent: ",
                service.send("")
        );
    }
}