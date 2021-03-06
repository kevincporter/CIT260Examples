/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;


/**
 *
 * @author jacksonrkj
 */
public class Player {

    public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER"; 
    
    private String name;
    private double age;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String marker;
    
    

    public Player() {
    }

    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }


    
    
    
    private double getWinningPercentage() {
        double totalScore = this.getWins() + this.getLosses() + this.getTies();
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = this.getWins() / totalScore;
        return winLossRatio*100;
    }

    public String getPlayerStastics() {
        String playerStatistics = 
                this.getName() + " has won "
                + this.getWinningPercentage() + "% of the games."
                + "\n\t" + this.getWins() + " wins, "
                + this.getLosses() + " losses and "
                + this.getTies() + " ties.";
        
        return playerStatistics;
    }

    
}
