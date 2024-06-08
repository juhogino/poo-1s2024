class CustomMap<K, V> extends AbstractMap<K, V> {
    private HashMap<K, V> map = new HashMap<>();

    @Override
    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public V put(K key, V value) {
        return map.put(key, value);
    }
}

CustomMap<String, Integer> mapa = new CustomMap<>();
mapa.put("Chave1", 10);
mapa.put("Chave2", 20);
System.out.println("Valor associado à Chave1: " + mapa.get("Chave1"));
