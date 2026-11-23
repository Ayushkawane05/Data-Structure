
class ProductOfNumbers {

    List<Integer> prod;

    public ProductOfNumbers() {
        prod = new ArrayList<>();
    }

    public void add(int num) {

        if (num == 0) {
            prod.clear();
        } else {
            int product = num;

            if (!prod.isEmpty()) {
                product *= prod.get(prod.size() - 1);
            }

            prod.add(product);
        }
    }

    public int getProduct(int k) {

        int n = prod.size();

        if (k > n) {
            return 0;
        }

        if (k == n) {
            return prod.get(n - 1);
        }

        return prod.get(n - 1) / prod.get(n - k - 1);
    }
}
