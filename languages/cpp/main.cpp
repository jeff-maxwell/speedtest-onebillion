#include <iostream>

int main()
{
    size_t count = 0;

    while(count < 1'000'000'000)
    {
        count++;
    }

    std::cout << count << std::endl;
}