public final class ImmutableClass {
    private final int x;
    private final int[] array = {1,2,3,4};

    public ImmutableClass(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    public ImmutableClass add(int x){
        return new ImmutableClass(this.x + x);
    }
}
