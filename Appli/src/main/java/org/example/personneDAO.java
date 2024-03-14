package org.example;

import java.sql.SQLException;
import java.util.List;

public interface personneDAO {
    List<personneDTO> getAll() throws SQLException;
    personneDTO getById(int id);
    void insert(personneDTO personne);
    void update(personneDTO personne);
    void delete(int id);
}
