#include <iostream>

class Pair {
public:
  int *pa, *pb;
  Pair(int, int);
  Pair(const Pair &);
  ~Pair();
};

// Define a default constructor with two arguments
Pair::Pair(int a, int b) {
  pa = new int;
  *pa = a;
  pb = new int;
  *pb = b;
}

// Define a copy costructor with two arguments
Pair::Pair(const Pair & obj) {
  pa = new int;
  *pa = *obj.pa;
  pb = new int;
  *pb = *obj.pb;
}

// Define a deconstructor
Pair::~Pair() {
  delete pa;
  delete pb;
}

int main() {
  Pair p(15,16);
  Pair q(p);
  Pair *hp = new Pair(23,42);
  delete hp;

  std::cout << "If this message is printed,"
            << " at least the program hasn't crashed yet!\n"
            << "But you may want to print other diagnostic messages too." << std::endl;
  return 0;
}
