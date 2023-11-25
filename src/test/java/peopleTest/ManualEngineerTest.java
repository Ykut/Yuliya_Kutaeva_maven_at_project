package peopleTest;

import org.junit.Assert;
import org.junit.Test;
import people.ManualEngineer;

public class ManualEngineerTest {
    ManualEngineer manualEngineer = new ManualEngineer(21, 12);

    @Test
    public void testAgeGet() {
        Assert.assertEquals("The age is not correct!",21, manualEngineer.getAge());
    }

    @Test
    public void testAgeSet(){
        manualEngineer.setAge(34);
        Assert.assertEquals("The age is not correct!", 34, manualEngineer.getAge());
    }
    @Test
    public void testSkillGet() {
        Assert.assertEquals(24, manualEngineer.getSkill());
    }
    @Test
    public void testSkillSet(){
        manualEngineer.setSkill(32);
        Assert.assertEquals(32, manualEngineer.getSkill());
    }

    @Test
    public void testExpGet() {
        Assert.assertEquals(12, manualEngineer.getExperience());
    }
    @Test
    public void testExpSet(){
        manualEngineer.setExperience(5);
        Assert.assertEquals(5, manualEngineer.getExperience());
    }

}
