package peopleTest;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import people.AutomatedEngineer;
import people.ManualEngineer;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomatedEngineerTest {
    AutomatedEngineer automatedEngineer = new AutomatedEngineer(34,4);

    @Test
    public void testAgeGet() {
        Assert.assertEquals("The age is not correct!",34,automatedEngineer.getAge());
    }

    @Test
    public void testAgeSet(){
        automatedEngineer.setAge(21);
        Assert.assertEquals("The age is not correct!", 21, automatedEngineer.getAge());
    }
    @Test
    public void testSkillGet() {
        Assert.assertEquals(12, automatedEngineer.getSkill());
    }
    @Test
    public void testSkillSet(){
        automatedEngineer.setSkill(32);
        Assert.assertEquals(32, automatedEngineer.getSkill());
    }

    @Test
    public void testExpGet() {
        Assert.assertEquals(4, automatedEngineer.getExperience());
    }
    @Test
    public void testExpSet(){
        automatedEngineer.setExperience(5);
        Assert.assertEquals(5, automatedEngineer.getExperience());
    }

}
