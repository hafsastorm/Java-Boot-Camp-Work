package AdventureGameInterface;
import java.util.Iterator;
import javax.swing.JPanel;

public interface iMaze 
{
	
	    iPosition getStartingPosition();
		iPosition getCurrentPosition();
	 	Iterator<iPosition> iterator( iPosition position );
	 	boolean isEndPosition( iPosition position );
	 	boolean isValidPosition( iPosition position );
		JPanel getPanel();
	
		
		
		
		
		}
	

	
	 
	
		
		

