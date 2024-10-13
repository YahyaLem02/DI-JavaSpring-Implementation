package Presentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainSpringAnnotation {

    public static void main(String[] args) {
        // Utilisation correcte de AnnotationConfigApplicationContext avec des classes de configuration
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","dao2");

        // Récupération du bean metier
        Imetier metier = context.getBean(Imetier.class);

        // Affichage du résultat
        System.out.println("Le résultat est : " + metier.calcul());
    }
}
