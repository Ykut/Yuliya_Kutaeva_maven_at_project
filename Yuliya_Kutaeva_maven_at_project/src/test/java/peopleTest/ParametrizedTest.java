package peopleTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    private Engineer en;
    private int expSkill;

    public ParametrizedTest(Engineer en, int expSkill) {
        this.en = en;
        this.expSkill = expSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {new AutomatedEngineer(24, 10), 30},
                        {new ManualEngineer(24, 10), 20}
                }
        );
    }
    @Test
    public void checkDefaultAge(){
        assertEquals("The age is not correct!", expSkill, en.getAge());
    }

    @Test
    public void checkDefaultSkill(){
        assertEquals("The age is not correct!", expSkill, en.getSkill());
    }

    @Before
    public void printString(){
        System.out.println("Somestring");
    }
 }



