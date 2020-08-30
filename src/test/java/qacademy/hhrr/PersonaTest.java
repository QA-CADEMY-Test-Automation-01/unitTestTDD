package qacademy.hhrr;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void getFullNameTest() {
        //Arrange - Given
        Persona persona = new Persona("bruno", "barrios");

        //Act - When
        String expected = "Bruno Barrios";

        //Assert - Then
        assertEquals("Full name does not match with ".concat(expected), expected, persona.getFullName());
    }


    @Test
    public void getPersonJsonFormat() {
        //Arrange
        Persona persona = new Persona("bruno", "barrios", 27);
        String expected = "{\"Name\":\"Bruno\",\"Apellido\":\"Barrios\",\"Full Name\":\"Bruno Barrios\",\"Age\":\"27\"}";
        //Act
        String actual = persona.getPersonJson();
        //Assert
        assertEquals("Format does not match", expected, actual);
    }


}