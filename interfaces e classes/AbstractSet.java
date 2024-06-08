class CustomHashSet<E> extends AbstractSet<E> {
    private HashSet<E> set = new HashSet<>();

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean add(E e) {
        return set.add(e);
    }
}

CustomHashSet<String> conjunto = new CustomHashSet<>();
conjunto.add("Elemento 1");
conjunto.add("Elemento 2");
System.out.println("Tamanho do conjunto: " + conjunto.size());
