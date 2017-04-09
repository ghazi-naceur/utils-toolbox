package thread;

/**
 * Created by Ghazi Ennacer on 09/04/2017.
 */
public class SeparateThread<T> {

    public T value;
    public ThreadLocal<T> thread;

    public SeparateThread(T value) {
        this.value = value;
        this.thread = new ThreadLocal<T>(){
          @Override
            public T get(){
              return SeparateThread.this.value;
          }
        };
    }
    public void update(final T value){
        this.value = value;
    }
    public T get(){
        return thread.get();
    }
}
