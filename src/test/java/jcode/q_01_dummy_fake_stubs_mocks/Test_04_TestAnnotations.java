package jcode.q_01_dummy_fake_stubs_mocks;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class Test_04_TestAnnotations {

    @Test
    public void test1() {

    }

    @RepeatedTest(value = 10)
    public void repeatedTest() {

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void parameterizedTest(int number) {
//        assertTrue(Numbers.isOdd(number));
    }

    //Динамическое создание тестов
    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    /**
     * test method to be executed multiple times, with each invocation using a different combination of configurations such as:
     * <p>
     * They are a powerful generalization of parameterized and repeated tests.
     */
//    @TestTemplate
//    @ExtendWith(UserIdGeneratorTestInvocationContextProvider.class)
//    public void whenUserIdRequested_thenUserIdIsReturnedInCorrectFormat(UserIdGeneratorTestCase testCase) {
//        UserIdGenerator userIdGenerator = new UserIdGeneratorImpl(testCase.isFeatureEnabled());
//
//        String actualUserId = userIdGenerator.generate(testCase.getFirstName(), testCase.getLastName());
//
//        assertThat(actualUserId).isEqualTo(testCase.getExpectedUserId());
//    }
}
