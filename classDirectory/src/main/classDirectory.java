package main;
import java.util.*;

public class classDirectory {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("initialization:");
        String[] names = {
                "Acosta, Tristan D.",//0
                "Alcantara, Clurk Joshua P.",//1
                "Andres, Justin F.",//2
                "Aproda, Jeremy S.",//3
                "Balaba, Claire Angeli J.",//4
                "Baguio, Rejie Mae",//5
                "Bandiez, Cristopher A.",//6
                "Baterisna, John Alex V.",//7
                "Bautista, Prinz Zedric",//8
                "Blanquisco, Shiryl Anne C.",//9
                "Bodota, Raymond V.",//10
                "Brazil, Kurt Sebastian J.",//11
                "Bustamante, Jake A.",//12/
                "Bustamante, Nicole Angela A.",//13
                "Cadiz, Maui C.",//14
                "Cañendo, Blasslie Jhay M.",//15
                "Cortez, Micko Gabriel ",//16
                "Daoang, Danielle Lorence L.",//17
                "Dean, Daniela",//18
                "Dela Cruz, Kyle Joshua M.",//19
                "Derilo, Joel Joseph L.",//20
                "Domondon, Daniel Isaiah",//21
                "Dulay, Luis Miguel G.",//22
                "Fortez, Stephanie Joyce B.",//23
                "Francisco, Mary Paula L. ",//24
                "Fuentes, Darelle P.",//25
                "Fuertes, Joshua Brynne M."//26
            }; System.out.println("Student count: " + names.length);
        String[] id = {
                "12223MN-000401",//0
                "12223MN-000580",//1
                "12223MN-000---",//2
                "12223MN-000533",//3
                "12223MN-000540",//4
                "12223MN-000---",//5
                "12223MN-000541",//6
                "12223MN-000542",//7
                "12223MN-000543",//8
                "12223MN-000488",//9
                "12223MN-000489",//10
                "12223MN-000490",//11
                "12223MN-000491",//12
                "12223MN-000493",//13
                "12223MN-000494",//14
                "12223MN-000495",//15
                "12223MN-000483",//16
                "12223MN-000484",//17
                "12223MN-000478",//18
                "12223MN-000485",//19
                "12223MN-000486",//20
                "12223MN-000477",//21
                "12223MN-000487",//22
                "12223MN-000479",//23
                "12223MN-000480",//24
                "12223MN-000481",//25
                "12223MN-000482",//26
        }; System.out.println("ID number count: " + id.length);
        String[] contactNumber = {
                "(+63)9331862897",//acosta
                "(+63)9213806278",//alcantara
                "(+63)9123566851",//aproda
                "unknown",//andres
                "(+63)9491528187",//balaba
                "unknown",//baguio
                "(+63)9618793379",//bandiez
                "(+63)9399525633",//baterisna
                "(+63)9150781446",//bautista
                "(+63)9273123288",//blanquisco
                "(+63)9953914579",//bodota
                "(+63)9954540889",//brazil
                "(+63)9691698627",//jake
                "(+63)9121221409",//nicole
                "(+63)9271808951",//cadiz
                "(+63)9092142897",//canendo
                "(+63)9086394970",//cortez
                "(+63)9657211913",//daoang
                "(+63)9672232086",//dean
                "(+63)9476370729",//dela cruz
                "(+63)9516354411",//derilo
                "(+63)9691698744",//domondon
                "(+63)9674486221",//dulay
                "(+63)9564800285",//fortez
                "(+63)9285825516",//francisco
                "(+63)9293792317",//fuentes
                "(+63)9452702238",//fuertes
        }; System.out.println("contact number/s count: " + contactNumber.length);
        String[] emails = {
                "tristanacosta03@gmail.com",//0
                "iamclurk@gmail.com",//1
                "jianaproda@gmail.com",//2
                "",//3
                "balaba.claire2003@gmail.com",//4
                "",//5
                "bandiez.cristopher@gmail.com",//6
                "johnbaterisna@gmail.com",//7
                "bautistaprinz.acads2022@gmail.com",//8
                "shirylanne2@gmail.com",//9
                "bodotaraymond510@gmail.com",//10
                "kurtsebastianbrazil2004@gmail.com",//11
                "tabacajes82@gmail.com",//12
                "caryshope25@gmail.com",//13
                "mauicadiz98@gmail.com",//14
                "Blastleez11@gamail.com",//15
                "Gabriemicko@gmail.com",//16
                "daniellelorencedaoang@gmail.com",//17
                "deandaniela789@gmail.com",//18
                "delacruzkylejoshua@gmail.com",//19
                "josephderilo613@gmail.com",//20
                "danieldomondon8@gmail.com",//21
                "luisdulay14@gmail.com",//22
                "stephaniefortez210@gail.com",//23
                "marypaulaf@gmail.com",//24
                "darellefuentes782@gmail.com",//25
                "brynnemontecillo@gmail.com",//26
        }; System.out.println("emails count: " + emails.length);
        int code;
        int menu;
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("BSAIS 1-1 Class Directory");
        System.out.println("=========================");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        System.out.println("=========================");
        System.out.println("menu:");
        System.out.println("1. search");
        System.out.println("2. exit");
        System.out.println("=========================");
            System.out.println();
            System.out.println();
            System.out.println();
        System.out.println("=========================================================");
        System.out.println("created by group 5, BSAIS 1-1. All rights reserved 2023.");
        System.out.println("=========================================================");
        boolean exit = false;
        System.out.print("option: ");
        menu = input.nextInt();
            System.out.println();

        switch (menu) {
            case 1: {
                System.out.println("Enter the last three digits of your Student Number :");
                code = input.nextInt();
                if (code == 401) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[0]);
                    System.out.println("Name of Student: " + names[0]);
                    System.out.println("Student contact number: " + contactNumber[0]);
                    System.out.println("Student email address: " + emails[0]);
                } else if (code == 580) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[1]);
                    System.out.println("Name of Student: " + names[1]);
                    System.out.println("Student contact number: " + contactNumber[1]);
                    System.out.println("Student email address: " + emails[1]);
                } else if (code == 533) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[3]);
                    System.out.println("Name of Student: " + names[3]);
                    System.out.println("Student contact number " + contactNumber[3]);
                    System.out.println("Student email address: " + emails[3]);
                } else if (code == 540) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[4]);
                    System.out.println("Name of Student: " + names[4]);
                    System.out.println("Student contact number " + contactNumber[4]);
                    System.out.println("Student email address: " + emails[4]);
                } else if (code == 541) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[6]);
                    System.out.println("Name of Student: " + names[6]);
                    System.out.println("Student contact number " + contactNumber[6]);
                    System.out.println("Student email address: " + emails[6]);
                } else if (code == 542) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[7]);
                    System.out.println("Name of Student: " + names[7]);
                    System.out.println("Student contact number " + contactNumber[7]);
                    System.out.println("Student email address: " + emails[7]);
                } else if (code == 543) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[8]);
                    System.out.println("Name of Student: " + names[8]);
                    System.out.println("Student contact number " + contactNumber[8]);
                    System.out.println("Student email address: " + emails[8]);
                } else if (code == 488) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[9]);
                    System.out.println("Name of Student: " + names[9]);
                    System.out.println("Student contact number " + contactNumber[9]);
                    System.out.println("Student email address: " + emails[9]);
                } else if (code == 489) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[10]);
                    System.out.println("Name of Student: " + names[10]);
                    System.out.println("Student contact number " + contactNumber[10]);
                    System.out.println("Student email address: " + emails[10]);
                } else if (code == 490) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[11]);
                    System.out.println("Name of Student: " + names[11]);
                    System.out.println("Student contact number " + contactNumber[11]);
                    System.out.println("Student email address: " + emails[11]);
                } else if (code == 491) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[12]);
                    System.out.println("Name of Student: " + names[12]);
                    System.out.println("Student contact number " + contactNumber[12]);
                    System.out.println("Student email address: " + emails[12]);
                } else if (code == 493) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[13]);
                    System.out.println("Name of Student: " + names[13]);
                    System.out.println("Student contact number " + contactNumber[13]);
                    System.out.println("Student email address: " + emails[13]);
                } else if (code == 494) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[14]);
                    System.out.println("Name of Student: " + names[14]);
                    System.out.println("Student contact number " + contactNumber[14]);
                    System.out.println("Student email address: " + emails[14]);
                } else if (code == 495) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[15]);
                    System.out.println("Name of Student: " + names[15]);
                    System.out.println("Student contact number " + contactNumber[15]);
                    System.out.println("Student email address: " + emails[15]);
                } else if (code == 483) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[16]);
                    System.out.println("Name of Student: " + names[16]);
                    System.out.println("Student contact number " + contactNumber[16]);
                    System.out.println("Student email address: " + emails[16]);
                } else if (code == 484) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[17]);
                    System.out.println("Name of Student: " + names[17]);
                    System.out.println("Student contact number " + contactNumber[17]);
                    System.out.println("Student email address: " + emails[17]);
                } else if (code == 478) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[18]);
                    System.out.println("Name of Student: " + names[18]);
                    System.out.println("Student contact number " + contactNumber[18]);
                    System.out.println("Student email address: " + emails[18]);
                } else if (code == 485) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[19]);
                    System.out.println("Name of Student: " + names[19]);
                    System.out.println("Student contact number " + contactNumber[19]);
                    System.out.println("Student email address: " + emails[19]);
                } else if (code == 486) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[20]);
                    System.out.println("Name of Student: " + names[20]);
                    System.out.println("Student contact number " + contactNumber[20]);
                    System.out.println("Student email address: " + emails[20]);
                } else if (code == 477) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[21]);
                    System.out.println("Name of Student: " + names[21]);
                    System.out.println("Student contact number " + contactNumber[21]);
                    System.out.println("Student email address: " + emails[21]);
                } else if (code == 487) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[22]);
                    System.out.println("Name of Student: " + names[22]);
                    System.out.println("Student contact number " + contactNumber[22]);
                    System.out.println("Student email address: " + emails[22]);
                } else if (code == 479) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[23]);
                    System.out.println("Name of Student: " + names[23]);
                    System.out.println("Student contact number " + contactNumber[23]);
                    System.out.println("Student email address: " + emails[23]);
                } else if (code == 480) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[24]);
                    System.out.println("Name of Student: " + names[24]);
                    System.out.println("Student contact number " + contactNumber[24]);
                    System.out.println("Student email address: " + emails[24]);
                } else if (code == 481) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[25]);
                    System.out.println("Name of Student: " + names[25]);
                    System.out.println("Student contact number " + contactNumber[25]);
                    System.out.println("Student email address: " + emails[25]);
                } else if (code == 482) {
                        System.out.println();
                    System.out.println("Student Information:");
                        System.out.println();
                    System.out.println("Student number: " + id[26]);
                    System.out.println("Name of Student: " + names[26]);
                    System.out.println("Student contact number " + contactNumber[26]);
                    System.out.println("Student email address: " + emails[26]);
                } else {
                    System.out.println("Student not found.");
                }
            }
                break;
            case 2:
                break;
            default:
                System.out.println("Error! Student not found. Please double-check your details and try again.");
                break;
        }
    }
}
