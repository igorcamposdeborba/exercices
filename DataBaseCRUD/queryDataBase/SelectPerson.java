package queryDataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connection.ConnectionFactory;
import entities.Person;

public class SelectPerson {
	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnection(); // Iniciar conexão com o banco
		
		// String sql = "SELECT * FROM people;";
		String sql = "SELECT * FROM people WHERE name LIKE ?;"; // sql com condição
		
		System.out.println("Digite um nome para buscar");
		String search = input.nextLine();
		
		PreparedStatement statement = connection.prepareStatement(sql); // ! PreparedStatement protege contra SQL injection
		statement.setString(1, "%" + search + "%"); // sql com condição e setString previne SQL injection
		
		ResultSet result =  statement.executeQuery(); // executar SQL E armazenar resposta recebida do banco de dados no ResultSet
		
		
		List<Person> people = new ArrayList<>();
		
		while(result.next() == true) { // passar por cada linha da resposta obtida do banco de dados
			int id = result.getInt("id");
			String name = result.getString("name");
			people.add(new Person(id, name)); // instanciar cada linha e colocar num array list
		}
		for (Person i : people) {
			System.out.println(i.getId() + " - " + i.getName());
		} 
		
		statement.close(); // fechar execução do SQL
		connection.close(); // fechar conexao
		input.close();
	}
}
