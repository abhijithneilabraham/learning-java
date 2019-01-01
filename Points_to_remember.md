The main thread is created automatically when our program is started. To control it we must obtain a reference to it.
This can be done by calling the method currentThread( ) which is present in Thread class. 
This method returns a reference to the thread on which it is called.
The default priority of Main thread is 5 and for all remaining user threads priority will be inherited from parent to child.
