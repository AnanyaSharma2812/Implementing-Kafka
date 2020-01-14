package com.training.kafkademo.documentandentity;
import java.util.List;
<<<<<<< HEAD


//@Configuration
public class MyCollection
{
    List<Employee> list_employee = new ArrayList<Employee>();
    protected int readCounter = 0;
    protected int writeCounter = 0;

    private MyCollection() { }

    //private static Object lockObject_add = new Object();
    private static MyCollection instance_add = null;

=======
import java.util.ArrayList;
public class MyCollection {
    List<Employee> list_employee = new ArrayList<Employee>();
    protected int readCounter = 0;
    protected int writeCounter = 0;

    private MyCollection() { }

    //private static Object lockObject_add = new Object();
    private static MyCollection instance_add = null;

>>>>>>> c429f1a8f79141faa0bcce09728233639e9fa8d2
    public static synchronized MyCollection getInstance(){
        if(instance_add == null)
        {
            instance_add = new MyCollection();
        }
        return instance_add;
    }

    public synchronized void add(Employee e)
    {
        if (writeCounter < 300) {
            list_employee.add(e);
            writeCounter++;
        }
    }
<<<<<<< HEAD

    public synchronized Employee get()
    {
        Employee get_emp = list_employee.get(readCounter++);
        return get_emp;
    }
}

=======
>>>>>>> c429f1a8f79141faa0bcce09728233639e9fa8d2

    public synchronized Employee get()
    {
        Employee get_emp = list_employee.get(readCounter++);
        return get_emp;
    }
}
