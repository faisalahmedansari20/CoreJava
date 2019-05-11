   import java.util.*;

    class NameComparator implements Comparator<Employees>
	{
		public int compare(Employees one,Employees two)
		{
			int r=(one.getName()).compareTo(two.getName());
			return r;
		}
	}
