package com.sergio5990.ita.spring2;

import com.sergio5990.ita.spring2.config.*;
import com.sergio5990.ita.spring2.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SpringTest {

    //factory method

    @Test
    void factoryMethodTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factory-method.xml");
        final Person bean = context.getBean(Person.class);
        bean.perform();
    }

    @Test
    void factoryMethodTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(FactoryMethodConfig.class);
        context.refresh();
        final Person bean = context.getBean(Person.class);
        bean.perform();
    }

    //constructor params

    @Test
    void constructorTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
        final PersonConstr bean = context.getBean(PersonConstr.class);
        bean.perform();
    }

    @Test
    void constructorTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConstructorConfig.class);
        context.refresh();
        final PersonConstr bean = context.getBean(PersonConstr.class);
        bean.perform();
    }

    //scope

    @Test
    void scopeTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        final PersonConstr bean = context.getBean(PersonConstr.class);
        bean.perform();
    }

    @Test
    void scopeTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ScopeConfig.class);
        context.refresh();
        final Person bean = context.getBean(Person.class);
        bean.perform();
    }

    //init and destroy methods

    @Test
    void initDestroyTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("init-destroy.xml");
        final PersonInitDestroy bean = context.getBean(PersonInitDestroy.class);
        bean.perform();
        context.close();
    }

    @Test
    void initDestroyTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(InitDestroyMethod.class);
        context.refresh();
        final PersonInitDestroy bean = context.getBean(PersonInitDestroy.class);
        bean.perform();
        context.close();
    }

    //init and destroy interface

    @Test
    void initDestroy2TestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("init-destroy2.xml");
        final PersonInitDestroy2 bean = context.getBean(PersonInitDestroy2.class);
        bean.perform();
        context.close();
    }

    @Test
    void initDestroy2TestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(InitDestroyMethod2.class);
        context.refresh();
        final PersonInitDestroy2 bean = context.getBean(PersonInitDestroy2.class);
        bean.perform();

        context.close();
    }

    //parameters

    @Test
    void paramsTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("params.xml");
        final PersonParams bean1 = (PersonParams) context.getBean("person");
        final PersonParams bean2 = (PersonParams) context.getBean("person2");
        final PersonParams bean3 = (PersonParams) context.getBean("person3");
        bean1.perform();
        bean2.perform();
        bean3.perform();
        context.close();
    }

    @Test
    void paramsTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ParamsConfig.class);
        context.refresh();
        final PersonParams bean1 = (PersonParams) context.getBean("person");
        final PersonParams bean2 = (PersonParams) context.getBean("person2");
        bean1.perform();
        bean2.perform();
        context.close();
    }

    // parameter as bean

    @Test
    void paramsBeanTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("params_bean.xml");
        final PersonParams bean1 = (PersonParams) context.getBean("person");
        final PersonParamsBean bean2 = (PersonParamsBean) context.getBean("person2");
        bean1.perform();
        bean2.perform();
        context.close();
    }

    @Test
    void paramsBeanTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ParamsBeanConfig.class);
        context.refresh();
        final PersonParams bean1 = (PersonParams) context.getBean("person");
        final PersonParamsBean bean2 = (PersonParamsBean) context.getBean("person2");
        bean1.perform();
        bean2.perform();
        context.close();
    }

    // property as list

    @Test
    void propsTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        final Props bean = (Props) context.getBean("props");
        System.out.println(bean);
    }

    @Test
    void propsTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PropsConfig.class);
        context.refresh();
        final Props bean =  context.getBean(Props.class);
        System.out.println(bean);
        context.close();
    }

    // spel
    // !!! NO GOD! PLEASE NO!!! NOOOOOOOOOO https://www.youtube.com/watch?v=umDr0mPuyQc
    @Test
    void spelTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
        final Spel bean = context.getBean(Spel.class);
        System.out.println(bean);
    }

    @Test
    void spelTestJava() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(NoSpel.class);
        context.refresh();
        final Spel bean =  context.getBean(Spel.class);
        System.out.println(bean);
        context.close();
    }
}