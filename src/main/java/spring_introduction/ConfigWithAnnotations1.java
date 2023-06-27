package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();


//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());

        context.close();
    }

}
