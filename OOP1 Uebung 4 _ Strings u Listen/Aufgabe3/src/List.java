
public class List {
    private Object[] list = new Object[8];
    void add(Object element) {
        if (list == null) { //check if list contains no positions
            Object[] listBigger = new Object[size()+(size()/2)];
            System.arraycopy(list, 0, list, 0, size()+(size()/2));
            list = listBigger;
            add(element);
        }
        else if (this.list[list.length-1] == null) { //check that list is not full
            int i = 0;
            while (this.list[i] != null) { //iterate till "index = null" is reached to assign value
                i++;
            }
            this.list[i] = element; //assign value at index
        } else {
            Object[] listBigger = new Object[size()+50];
            list = listBigger;
            System.arraycopy(list, 0, list, 0, size()+5);
            add(element);
        }
    }
    Object get(int position) {
        if (position <= list.length-1) {
            return list[position]; // return value at given index(position)
        }
        return 69; //problem here
    }
    boolean contains(Object element) {
        boolean duplicates=false;
        for (int j=0;j<list.length;j++)
            for (int k=j+1;k<list.length;k++)
                if (k!=j && list[k] == list[j])
                    duplicates=true;
        return duplicates;
    }
    void remove(Object element) {
        for (int i =0; i < size(); i++) { // iterate every index of list
            if (element == list[i]) {    // if list at index matches element set to null
                list[i] = null;
                break;                    // break because only first element should be removed
            }
        }
    }
    int size() {
        int i =1;
        if (list == null) { //if list has no positions, return 0
            return 0;
        } else {
            while (i < list.length && list[i] != null) { //iterate till index == null
                i++;
            }
            return i;
        }

    }

 }
