import pytest
from main import merge_sort

def test_merge_sort():
    # Test Case 1: Lista desordenada
    assert merge_sort([4, 2, 7, 1, 9]) == [1, 2, 4, 7, 9]

    # Test Case 2: Lista ya ordenada
    assert merge_sort([1, 2, 4, 7, 9]) == [1, 2, 4, 7, 9]

    # Test Case 3: Lista con elementos repetidos
    assert merge_sort([5, 2, 5, 1, 2]) == [1, 2, 2, 5, 5]

# Ejecuta las pruebas si se ejecuta este archivo
if __name__ == "__main__":
    pytest.main()
