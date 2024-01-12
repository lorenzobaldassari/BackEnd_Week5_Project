//package LorenzoBaldassari.Week5_Project;
//
//import LorenzoBaldassari.Week5_Project.Entities.Edificio;
//import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
//import LorenzoBaldassari.Week5_Project.Entities.Postazione;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BeansCofniguration {
//
//    @Bean
//    Edificio edificio1(){
//        return new Edificio("banca","via parma 17","milano");
//    }
//    @Bean
//    Edificio edificio2(){
//        return new Edificio("supermercato","via olmo 44","messina");
//    }
//    @Bean
//    Edificio edificio3(){
//        return new Edificio("grande casa","capanno dei pescatori","ravensthorpe");
//    }
//    @Bean
//    Postazione postazione1(){
//        return new Postazione("luogo commerciale", TipoPostazione.SALA_RIUNIONI,10,edificio1());
//    }
//    @Bean
//    Postazione postazione2(){
//        return new Postazione("piscina comfrot relax", TipoPostazione.OPENSPACE,150,edificio2());
//    }
//    @Bean
//    Postazione postazione3(){
//        return new Postazione("luogo di ritrovo,condivisione, decisioni politiche e feste", TipoPostazione.OPENSPACE,100,edificio3());
//    }
//}
