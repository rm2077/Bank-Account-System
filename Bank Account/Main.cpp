#include <iostream>
#include <string>
using namespace std;
class Student{
private:
    string pass;
public:
    string name;
    int age;
    Student(string name, int age) {
        this->name = name;
        this->age = age;
    }

    void Info() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }

    void Info() {}
};

int main() {
    Student s1 = Student("Raunak", 16);
    s1.Info();
    return 0;
}