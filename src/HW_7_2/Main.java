//public class Kata {
//    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//        int curhp1 = fighter1.health;
//        int curhp2 = fighter2.health;
//        String winner="";
//
//
//        if (firstAttacker == fighter1.name){                                  //если файтер1 первый атакует
//            while ( fighter1.damagePerAttack < curhp2 && fighter2.damagePerAttack < curhp1 ){   //пока они оба живы
//                curhp2 = curhp2 - fighter1.damagePerAttack;  // файтер1 делает первый атаку
//                if (curhp2 <=0){                             // если файтер2 умер, то
//                    winner = fighter1.name;
//                    return winner;                     // .. то КОНЕЦ и возвращается имя атакера1
//                }
//                if (curhp2 > 0){                               // если файтер2 выжил, то он
//                    curhp1 = curhp1 - fighter2.damagePerAttack;  // ..он делает атаку по файтеру1
//                }
//                if (curhp1 <=0){                            // если файтер1 умер, то
//                    winner=fighter2.name;
//                    return winner;                     // .. то КОНЕЦ и возвращается имя атакера2
//                }
//
//            }
//
//
//
//
//        }
//
//        if (firstAttacker == fighter2.name){     //если файтер2 первый атакует
//            while ( fighter1.damagePerAttack < curhp2 && fighter2.damagePerAttack < curhp1 ){   //пока они оба живы
//                curhp1 = curhp1 - fighter2.damagePerAttack;  // файтер2 делает первый атаку
//                if (curhp1 <=0){                             // если файтер1 умер, то
//                    winner = fighter2.name;
//                    return winner;                     // .. то КОНЕЦ и возвращается имя атакера2
//                }
//                if (curhp1 > 0){                               // если файтер1 выжил, то он
//                    curhp2 = curhp2 - fighter1.damagePerAttack;  // ..он делает атаку по файтеру2
//                }
//                if (curhp2 <=0){                            // если файтер2 умер, то
//                    winner = fighter1.name;
//                    return winner;                     // .. то КОНЕЦ и возвращается имя атакера1
//                }
//            }
//        }
//        return winner;
//    }
//
//}