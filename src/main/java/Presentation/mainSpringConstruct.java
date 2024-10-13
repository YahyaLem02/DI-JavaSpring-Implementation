package Presentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpringConstruct {

    public static void main(String[] args) {
        // Utilisation correcte de AnnotationConfigApplicationContext avec des classes de configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDiConstruct.xml");

        // Récupération du bean metier
        Imetier metier = context.getBean(Imetier.class);

        // Affichage du résultat
        System.out.println("Le résultat est : " + metier.calcul());
    }
}
