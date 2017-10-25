import java.util.InputMismatchException;
import java.util.*;
import java.util.Random;

//Fix it so card is dealt with new game starting

public class BlackJack {

    public static void main(String[] args) {
        Random randGen = new Random();

        int firstCard;
        int playerOption = 0;
        int playerHand;
        int dealerHand;

        //Statistics

        int playerWins = 0;
        int dealerWins = 0;
        int tieGames = 0;
        int gamesPlayed = 1;
        double percentPlayerWins;


        //Game 1

        System.out.println("START GAME #1" + "\n");

        firstCard = randGen.nextInt(13) + 1;
        dealerHand = randGen.nextInt(11) + 16;

        switch (firstCard) {
            case 1:
                System.out.println("Your card is an ACE!");
                playerHand = 1;
                break;

            case 11:
                System.out.println("Your card is a JACK!");
                playerHand = 10;
                break;

            case 12:
                System.out.println("Your card is a QUEEN!");
                playerHand = 10;
                break;

            case 13:
                System.out.println("Your card is a KING!");
                playerHand = 10;
                break;

            default:
                System.out.println("Your card is a " + firstCard + "!");
                playerHand = firstCard;
                break;
        }

        System.out.println("Your hand is: " + playerHand + "\n");

        //Start of while loop


        while (playerOption != 4) {
            Scanner scnr = new Scanner(System.in);
            //Menu

            //System.out.println("\n");

            System.out.println("1. Get another card");

            System.out.println("2. Hold hand");

            System.out.println("3. Print game statistics");

            System.out.println("4. Exit");

            System.out.println("\n" + "Choose an option: ");

            //End of Menu


            try {
                playerOption = scnr.nextInt();
                // if (playerOption < 1 || playerOption > 4) {
                // throw new Exception
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!\nPlease enter an integer value between 1 and 4.\n");
                //System.err.println("Please enter an integer value between 1 and 4.");
                scnr.nextLine();
                continue;

            }


            //If user chooses option 3

            if (playerOption == 3) {
                percentPlayerWins = (double) playerWins / (double) (gamesPlayed - 1);
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + tieGames);
                System.out.println("Total # of games played is: " + (gamesPlayed - 1));
                System.out.println("Percentage of Player wins: " + (int) (percentPlayerWins * 1000) / 10.0 + "%" + "\n");
            }


            //If user chooses option 2

            if (playerOption == 2) {
                System.out.println("Dealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + playerHand + "\n");
                //Hand with two cards below
                //Who wins

                if (playerHand == 21) {
                    System.out.println("BLACKJACK! You win!");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++playerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    playerHand = 0;
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    continue;

                } else if (playerHand > 21) {
                    System.out.println("\n" + "You exceeded 21! you lose :(");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++dealerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    playerHand = 0;

                    continue;

                }

               /*else {
                    System.out.println("Dealer's hand: " + dealerHand);
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;
                } */

                //Dealer's hand below

                if (dealerHand > 21) {
                    System.out.println("You win!");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++playerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    //playerHand = 0;

                } else if (dealerHand == playerHand) {
                    System.out.println("It's a tie! No one wins!");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++tieGames;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    playerHand = 0;


                } else if (dealerHand > playerHand && dealerHand <= 21) {
                    System.out.println("Dealer wins!");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++dealerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    playerHand = 0;

                } else if (playerHand > dealerHand && playerHand <= 21) {
                    System.out.println("You win!");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++playerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    playerHand = 0;

                }

            }

            //If user chooses option 1


            if (playerOption == 1) {
                firstCard = randGen.nextInt(13) + 1;
                switch (firstCard) {
                    case 1:
                        System.out.println("Your card is an ACE!");
                        playerHand = playerHand + 1;
                        break;

                    case 11:
                        System.out.println("Your card is a JACK!");
                        playerHand = playerHand + 10;
                        break;

                    case 12:
                        System.out.println("Your card is a QUEEN!");
                        playerHand = playerHand + 10;
                        break;

                    case 13:
                        System.out.println("Your card is a KING!");
                        playerHand = playerHand + 10;
                        break;

                    default:
                        System.out.println("Your card is a " + firstCard + "!");
                        playerHand = playerHand + firstCard;
                        break;


                }

                System.out.println("Your hand is: " + playerHand + "\n");

                if (playerHand > 21) {
                    System.out.println("You exceeded 21! you lose :(");
                    dealerHand = randGen.nextInt(11) + 16;
                    ++dealerWins;
                    ++gamesPlayed;
                    System.out.println("\n" + "START GAME #" + gamesPlayed + "\n");
                    firstCard = randGen.nextInt(13) + 1;
                    dealerHand = randGen.nextInt(11) + 16;

                    switch (firstCard) {
                        case 1:
                            System.out.println("Your card is an ACE!");
                            playerHand = 1;
                            break;

                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerHand = 10;
                            break;

                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerHand = 10;
                            break;

                        case 13:
                            System.out.println("Your card is a KING!");
                            playerHand = 10;
                            break;

                        default:
                            System.out.println("Your card is a " + firstCard + "!");
                            playerHand = firstCard;
                            break;
                    }

                    System.out.println("Your hand is: " + playerHand + "\n");
                    playerHand = 0;

                }
            }


            //return;
            if (playerOption < 1) {
                System.out.println("Invalid input!" + "\n" + "Please enter an integer value between 1 and 4.\n");
                //scnr.nextLine();
                continue;

            }
            if (playerOption > 4) {
                System.out.println("Invalid input!" + "\n" + "Please enter an integer value between 1 and 4.\n");
                //scnr.nextLine();
                continue;

            }

        }
    }
}