package sess.jun2IPLProject;

import java.util.List;
import java.util.Scanner;

public class PlayerMain {
     public static void main(String args[]) {
    	 System.out.println("**********Welcome to IPL 2025****************");
    	 PlayerController pc = new PlayerController();
    	 boolean flag=true;
    	 List<Player> playerList= null;
    	 Player p=null;
    	 int rowCnt, playerid;
	     Scanner sc = new Scanner(System.in);
	     while(flag) {
	    	 System.out.println();
	    	 System.out.println("The Operations to perform :\n\n1.Print All Player Details.\n2.Player Details By ID.\n3.Player Details By Name. \n4.Player Details By TeamName.\n5.Player Details of Batsmans.\n6.Player Details of Bowlers.\n7.Player Details of Highest Score.\n8.Player Details of Highest Wickets.\n9.Player Details of Highest Catches.\n10.Insert New Player.\n11.Update Player by Team Name.\n12.Update Total Runs of the Player.\n13.Update Total Wickets of the Player.\n14.Update Total Catches of the Player. \n15.Delete Player by ID\n16.Exit.");
	    	 System.out.println();
	    	 System.out.println("Enter the Choice : ");
	    	 int choice = sc.nextInt();
	    	 switch(choice) {
	    	   
	    	  case 1  : System.out.println("All Player Details : ");
	    	            System.out.println();
	    	            playerList=pc.getPlayerList();
	    	            System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
	    	            System.out.println();
	    	            playerList.forEach(System.out::println);
	    	            break;
	    	          
	    	 case 2  : System.out.println("Enter the player id to search : ");
	    	           int id=sc.nextInt();
	    		       p=pc.getPlayerByID(id);
	    		       if(p!=null) {
	    		       System.out.println("The Player Details for the ID number : "+id+" is : ");
	    		       System.out.println();
	    		       System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
	    		       System.out.println();
	    		       System.out.println(p);
	    		       }
	    		       else {
	    		       System.out.println("The Player with the ID : "+id+" is not present.");
	    		       }
	    	           break;
	    	           
	    	 case 3 : System.out.println("Enter the Name of the Player to search : ");
                      String name=sc.next();
                      playerList=pc.getPlayerByName(name);
                      if(playerList!=null) {
                          System.out.println("The details of the Player : "+name+" are : ");
                          System.out.println();
                          System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
                          System.out.println();
                          for(Player p1 : playerList) {
           	                   System.out.println(p1);
                              }     
                           }
                       else {
                               System.out.println(name +" - the player is not present in the IPL-2025");
                            }
                       break;
	                       
	    	 case 4  : System.out.println("Enter the Team Name of the Players to search : ");
                       String teamName=sc.next();
                       playerList=pc.getPlayersByTeamName(teamName);
                       if(playerList!=null) {
                              System.out.println("The Players of the team : "+teamName+" are : ");
                              System.out.println();
                              System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
                              System.out.println();
                              for(Player p1 : playerList) {
               	                   System.out.println(p1);
                                  }     
                               }
                       else {
                                   System.out.println("The Team Name :[ "+teamName+" ] is not present in the TATA IPL 2025.");
                             }
                       break;
                       
	    	 case 5  : playerList=pc.getBatsmans("Batsman");
	    	           if(playerList!=null) {
                           System.out.println("The Batsmans in the TATA IPL-2025 are : ");
                           System.out.println();
                           System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
                           System.out.println();
                           for(Player p1 : playerList) {
            	                   System.out.println(p1);
                               }     
                            }
                       else {
                                System.out.println("There are no Batsmans part of IPL-2025.");
                          }
	    	           break;
	    	           	    	           
	    	 case 6  : playerList=pc.getBatsmans("Bowler");
	                   if(playerList!=null) {
                           System.out.println("The Bowlers in the TATA IPL-2025 are : ");
                           System.out.println();
                           System.out.println("ID\tName\tTeam Name \tPosition\tRuns\tWickets\t\tCatches");
                           System.out.println();
                           for(Player p1 : playerList) {
    	                         System.out.println(p1);
                            }     
                             }
                       else {
                             System.out.println("There are no Bowlers part of IPL-2025.");
                           }
	                   break;
	                  
	    	 case 7  : p=pc.getMaximumRuns();
	    	           System.out.println();
	    	           System.out.println("The Maximum runs scored by the Player overall in the tournament is : "+p.getName());
	    	           System.out.println("The Runs Scored is : "+p.getRuns());
	    	           System.out.println();
	    	           System.out.println("The Player Details are : ");
	    	           System.out.println();
	    	           System.out.println(p);
	    	           break;
	    	           
	    	 case 8  : p=pc.getMaximumWickets();
	                   System.out.println();
	                   System.out.println("The Maximum wickets taken by the Player overall in the tournament is : "+p.getName());
	                   System.out.println("The Wickets Taken  are : "+p.getWickets());
	                   System.out.println();
	                   System.out.println("The Player Details are : ");
	                   System.out.println();
	                   System.out.println(p);
	                   break;
	                  
	    	 case 9  : p=pc.getMaximumCatches();
                       System.out.println();
                       System.out.println("The Maximum Catches taken by the Player overall in the tournament is : "+p.getName());
	                   System.out.println("The Catches Taken  are : "+p.getCatches());
                       System.out.println();
                       System.out.println("The Player Details are : ");
                       System.out.println();
                       System.out.println(p);
                       break;
                       
	    	 case 10 : System.out.println("Enter Player ID :");
	    	           int pid=sc.nextInt();
	    	           System.out.println("Enter Player name :");
	    	           String pname=sc.next();
	    	           System.out.println("Enter Team Name of the player :");
	    	           String ptname=sc.next();
	    	           System.out.println("Enter the position of the player :");
	    	           String playerpos=sc.next();
	    	           System.out.println("Enter Runs scored by the player in the tournament :");
	    	           int runs=sc.nextInt();
	    	           System.out.println("Enter Wickets taken by the player in the tournament :");
	    	           int wickets=sc.nextInt();
	    	           System.out.println("Enter Catches taken by the player in the tournament :");
	    	           int catches=sc.nextInt();
	    	           Player newPlayer = new Player(pid,pname,ptname,playerpos,runs,wickets,catches);
	    		       String s = pc.insertNewPlayer(newPlayer);
	    		       System.out.println(s);
	    		       break;
	    		 	    		 
	    	 case 11 : System.out.println("Enter Id of the Player to Update the Team Name : ");
	    	           playerid=sc.nextInt();
	    	           System.out.println("Enter the Updated Team Name : ");
	    	           String playerTeamName = sc.next();
	    	           rowCnt = pc.updatePlayerTeamNameByID(playerid,playerTeamName);
	    	           if (rowCnt > 0) {
	    	               System.out.println("Player Team Name updated successfully.");
	    	           } else {
	    	               System.out.println("No Player found with ID : " + playerid);
	    	           }
	    		       break;
	    		       
	    	 case 12 : System.out.println("Enter Id of the Player to Update the Total Runs : ");
	                   playerid=sc.nextInt();
	                   System.out.println("Enter the Total Runs to be Updated : ");
	                   int playerRuns = sc.nextInt();
	                   rowCnt = pc.updatePlayerRunsByID(playerid,playerRuns);
	                   if (rowCnt > 0) {
	                         System.out.println("Player Total Runs updated successfully.");
	                   } else {
	                         System.out.println("No Player found with ID : " + playerid);
	                     }
		               break;
		               
	    	 case 13 : System.out.println("Enter Id of the Player to Update the Total Wickets : ");
                       playerid=sc.nextInt();
                       System.out.println("Enter the Total Wickets to be Updated : ");
                       int playerWickets = sc.nextInt();
                       rowCnt = pc.updatePlayerWicketsByID(playerid,playerWickets);
                       if (rowCnt > 0) {
                    	   System.out.println("Player Total Wickets updated successfully.");
                       } else {
                    	   System.out.println("No Player found with ID : " + playerid);
                       }
                       break;
	    		 
	    	 case 14 : System.out.println("Enter Id of the Player to Update the Total Catches : ");
             		   playerid=sc.nextInt();
             		   System.out.println("Enter the Total Catches to be Updated : ");
             		   int playerCatches= sc.nextInt();
             		   rowCnt = pc.updatePlayerCatchesByID(playerid,playerCatches);
             		   if (rowCnt > 0) {
             			   System.out.println("Player Total Catches updated successfully.");
             		   } else {
             		   System.out.println("No Player found with ID : " + playerid);
             		   }
             		   break;
	    		 
	    	 case 15 : System.out.println("Enter Id of the Player to Delete : ");
	    	           int PlayerID=sc.nextInt();
	    	           rowCnt = pc.deletePlayerByID(PlayerID);
	    	           if (rowCnt > 0) {
	    	               System.out.println("Player with ID " + PlayerID + " has been deleted successfully.");
	    	           } else {
	    	               System.out.println("No student found with ID " + PlayerID);
	    	           }
	    	           break;
	    	           
	    	 case 16 : flag=false;
	    	           break;
	    	 }
     }
	     System.out.println("**********Thank you for Checking IPL Player Management System****************");
     }
}
