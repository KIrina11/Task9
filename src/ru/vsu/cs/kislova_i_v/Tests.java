package ru.vsu.cs.kislova_i_v;

import org.junit.*;
import ru.vsu.cs.util.ArrayUtils;

import java.util.List;

public class Tests {
    @BeforeClass
    public static void reportAboutStartOfTests() {
        System.out.println("Testing of the program begins...");
        System.out.println();
    }

    @Before
    public void reportOnTestOperation() {
        System.out.print("Test is running...");
    }

    @Test
    public void testWithoutPositiveNumbers() {
        List<Integer> listFotTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task9_num11"
                + "\\inputForTests\\input01TestWithoutPositiveNumbers.txt");
        List<Integer> listModified = SortPositiveNumbersInAscendingOrder.sortPositiveNumbersInAscendingOrder(listFotTest);
        List<Integer> listWithResultOfTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task9_num11\\outputForTests\\output01TestWithoutPositiveNumbers.txt");

        Assert.assertEquals(listModified, listWithResultOfTest);
    }

    @Test
    public void testConsistingOnlyOfPositiveNumbers() {
        List<Integer> listFotTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task9_num11"
                + "\\inputForTests\\input02TestConsistingOnlyOfPositiveNumbers.txt");
        List<Integer> listModified = SortPositiveNumbersInAscendingOrder.sortPositiveNumbersInAscendingOrder(listFotTest);
        List<Integer> listWithResultOfTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task9_num11\\outputForTests\\output02TestConsistingOnlyOfPositiveNumbers.txt");

        Assert.assertEquals(listModified, listWithResultOfTest);
    }

    @Test
    public void testConsistingOfNumbersEqualInModulus() {
        List<Integer> listFotTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task9_num11"
                + "\\inputForTests\\input03TestConsistingOfNumbersEqualInModulus.txt");
        List<Integer> listModified = SortPositiveNumbersInAscendingOrder.sortPositiveNumbersInAscendingOrder(listFotTest);
        List<Integer> listWithResultOfTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task9_num11\\outputForTests\\output03TestConsistingOfNumbersEqualInModulus.txt");

        Assert.assertEquals(listModified, listWithResultOfTest);
    }

    @Test
    public void testConsistingOfSingleElement() {
        List<Integer> listFotTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task9_num11"
                + "\\inputForTests\\input04TestConsistingOfSingleElement.txt");
        List<Integer> listModified = SortPositiveNumbersInAscendingOrder.sortPositiveNumbersInAscendingOrder(listFotTest);
        List<Integer> listWithResultOfTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task9_num11\\outputForTests\\output04TestConsistingOfSingleElement.txt");

        Assert.assertEquals(listModified, listWithResultOfTest);
    }

    @Test
    public void testStandardSituation() {
        List<Integer> listFotTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects\\Task9_num11"
                + "\\inputForTests\\input05TestStandardSituation.txt");
        List<Integer> listModified = SortPositiveNumbersInAscendingOrder.sortPositiveNumbersInAscendingOrder(listFotTest);
        List<Integer> listWithResultOfTest = ArrayUtils.readListFromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task9_num11\\outputForTests\\output05TestStandardSituation.txt");

        Assert.assertEquals(listModified, listWithResultOfTest);
    }

    @After
    public void reportCompletionOfTest() {
        System.out.println("Test execution completed");
    }

    @AfterClass
    public static void reportAboutEndOfTests() {
        System.out.println();
        System.out.print("Testing of the program is completed");
    }
}
