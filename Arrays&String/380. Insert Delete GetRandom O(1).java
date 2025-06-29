class RandomizedSet {
  HashMap<Integer,Integer> map;
  ArrayList<Integer> list;
  Random rand;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        }
        list.add(val); // it will add at the end s0 idx=list.size()-1;
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(list.contains(val)==false){
            return false;
        }else{
            // retreive idx
            int idx=map.get(val);
            int lastVal=list.get(list.size()-1); // last value of list
            // now swap deleting value with last value 
            list.set(idx,lastVal);
            map.put(lastVal,idx);
            // now delete from both list+map deleting value jo ki last mai aa gya hoga list mai
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
