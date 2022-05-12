package com.rohit.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	/**
    	 * ApplicationContext is superset of BeanFactory
    	 * ApplicationContext can do all the things what BeanFactory does
    	 * BeanFactory can be used when creating small application whereas...
    	 * ApplicationContext should be used when creating a large Enterprise level application
    	*/
    	
    	// Implementation using BeanFactory
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	// Implementation using ApplicationContext
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	// Here we have 100% dependency
    	// i.e. we are dependent on Triangle class on both sides
        // Triangle triangle = new Triangle();
        // triangle.draw();
        
        // Here now we have 50% dependency
        // i.e. we are dependent on Triangle class only on right side
        // Shape sh1 = new Triangle();
        // sh1.draw();
        
        // Now why to even have 50% dependency, So this is where spring comes
        // Spring provides us with a way to make our source code independent of Circle & Triangle classes
        
        // Shape sh2 = (Shape)factory.getBean("shape");
        // sh2.draw();
        
        // Shape sh3 = (Shape)context.getBean("shape");
        // sh3.draw();
        
        // Same as in the case of Triangle 
        // Circle circle = new Circle();
        // circle.draw();
        
        // Shape sh4 = new Circle();
        // sh4.draw();
        
        // Shape sh5 = (Shape)factory.getBean("shape");
        // sh5.draw();
        
        // Shape sh6 = (Shape)context.getBean("shape");
        // sh6.draw();
    	
    	Shape sh7 = (Shape)context.getBean("square");
    	sh7.draw();
    	
    	// Instantiating and calling using alias
    	// Shape sh8 = (Shape)context.getBean("rectangle");
    	// sh8.draw();
    }
}
