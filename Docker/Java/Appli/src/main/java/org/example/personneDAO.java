package org.example;

import java.sql.SQLException;
import java.util.List;

public interface personneDAO {
    List<personneDTO> getAll() throws SQLException;
    personneDTO getById(int id) throws SQLException;
    void insert(personneDTO personne) throws SQLException;
    void update(personneDTO personne);
    void delete(int id) throws SQLException;
}
