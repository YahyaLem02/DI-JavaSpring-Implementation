package Presentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpringXml {
    public static void main(String[] args) {

        // Création d'un conteneur d'application Spring
        // Le conteneur va lire le fichier "applicationContext.xml" pour configurer les beans (objets)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Récupération du bean nommé "metier" depuis le contexte Spring
        // Spring injecte automatiquement les dépendances définies dans le fichier XML
        Imetier metier = (Imetier) context.getBean("metier");

        // Appel de la méthode "calcul" sur l'instance du bean récupéré et affichage du résultat
        System.out.println("Le résultat est : " + metier.calcul());
    }
}
