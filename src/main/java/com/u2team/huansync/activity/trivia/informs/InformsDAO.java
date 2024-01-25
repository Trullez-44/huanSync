package com.u2team.huansync.activity.trivia.informs;

import com.u2team.huansync.activity.trivia.model.Trivia;
import com.u2team.huansync.persistence.BDConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformsDAO {

    public void getParticipantDetails() {
        try (Connection connection = BDConnection.MySQLConnection()) {
            String sql = "SELECT * FROM tbl_trivia" +
                    "JOIN tbl_customers AS p1 ON tbl_trivia.participantOneId = p1.customerId" +
                    "JOIN tbl_customers AS p2 ON tbl_trivia.participantTwoId = p2.customerId";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Trivia id: "+resultSet.getLong("triviaId"));
                    System.out.println("Incharged Id: "+resultSet.getLong("inchargedId"));
                    System.out.println("Activity Id: "+resultSet.getLong("activityId"));
                    System.out.println("Participant One Id: "+resultSet.getLong("participantOneId"));
                    System.out.println("Participant Two Id: "+resultSet.getLong("participantTwoId"));
                    System.out.println("Winner Id: "+resultSet.getLong("WinnerId"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getWinnersAndStaff() {
        try (Connection connection = BDConnection.MySQLConnection()) {
            String sql = "SELECT * FROM tbl_trivia" +
                    "LEFT JOIN tbl_customers AS winner ON tbl_trivia.winnerId = winner.customerId" +
                    "JOIN tbl_staff AS staff ON tbl_trivia.inchargedId = staff.staffId";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Trivia id: "+resultSet.getLong("triviaId"));
                    System.out.println("Incharged Id: "+resultSet.getLong("inchargedId"));
                    System.out.println("Activity Id: "+resultSet.getLong("activityId"));
                    System.out.println("Participant One Id: "+resultSet.getLong("participantOneId"));
                    System.out.println("Participant Two Id: "+resultSet.getLong("participantTwoId"));
                    System.out.println("Winner Id: "+resultSet.getLong("WinnerId"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getTriviasPerParticipant() {
        try (Connection connection = BDConnection.MySQLConnection()) {
            String sql = "SELECT participantOneId, COUNT(*) AS triviaCount" +
                    "FROM tbl_trivia" +
                    "GROUP BY participantOneId;";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Participant One Id: "+resultSet.getLong("participantOneId"));
                    System.out.println("Trivia Count:"+resultSet.getLong("triviaCount"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void getTriviasWithoutWinner() {
        try (Connection connection = BDConnection.MySQLConnection()) {
            String sql = "SELECT * FROM tbl_trivia" + "WHERE winnerId IS NULL;";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Trivia id: "+resultSet.getLong("triviaId"));
                    System.out.println("Incharged Id: "+resultSet.getLong("inchargedId"));
                    System.out.println("Activity Id: "+resultSet.getLong("activityId"));
                    System.out.println("Participant One Id: "+resultSet.getLong("participantOneId"));
                    System.out.println("Participant Two Id: "+resultSet.getLong("participantTwoId"));
                    System.out.println("Winner Id: "+resultSet.getLong("WinnerId"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    //get participants details ordered by activityId
    public void getParticipantDetailsByActivityId() {
        try (Connection connection = BDConnection.MySQLConnection()) {
            String sql = "SELECT * FROM tbl_trivia" +
                    "JOIN tbl_customers AS p1 ON tbl_trivia.participantOneId = p1.customerId" +
                    "JOIN tbl_customers AS p2 ON tbl_trivia.participantTwoId = p2.customerId" +
                    "ORDER BY activityId;";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("Trivia id: "+resultSet.getLong("triviaId"));
                    System.out.println("Incharged Id: "+resultSet.getLong("inchargedId"));
                    System.out.println("Activity Id: "+resultSet.getLong("activityId"));
                    System.out.println("Participant One Id: "+resultSet.getLong("participantOneId"));
                    System.out.println("Participant Two Id: "+resultSet.getLong("participantTwoId"));
                    System.out.println("Winner Id: "+resultSet.getLong("WinnerId"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
