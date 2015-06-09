
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	private Board board;
	
	@Before
	public void intialize(){
		board = new Board();
	}
	@Test           //Leeres Board -Kein Gewinner
	public void leeresBoard(){
		
		assertFalse(board.hasWinner());
		
		
	}
	
	@Test           //Gültige Markierung setzen -Kein Gewinner
	public void eintragOhneGewinner() throws Exception{
		board.setMark("X", 0, 0);
		
		assertFalse(board.hasWinner());
		
		
	}
	
	@Test          //Gültige Markierungen setzen -mit Gewinner
	public void eintraegeMitGewinner() throws Exception{
		board.setMark("X", 0, 0);
		board.setMark("X", 0, 1);
		board.setMark("X", 0, 2);
		
		assertTrue(board.hasWinner());
		
	}
	
	@Test             //Ungültige Markierung setzen
	public void eintraegeUngültig() throws Exception{
		board.setMark("X", 0, 0);
		board.setMark("X", 0, 0);
		
	}

}
