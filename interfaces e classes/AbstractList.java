class CustomList<E> extends AbstractList<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E set(int index, E element) {
        return list.set(index, element);
    }
}

CustomList<Integer> lista = new CustomList<>();
lista.add(10);
lista.add(20);
System.out.println("Primeiro elemento da lista: " + lista.get(0));
