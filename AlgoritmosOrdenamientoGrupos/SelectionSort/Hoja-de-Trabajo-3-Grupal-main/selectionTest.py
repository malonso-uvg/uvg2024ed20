'''
Se preguntó a AI:
    Puedes hacer una prueba unitaria de este código
'''
import unittest

from selection import selection_sort

class TestSum(unittest.TestCase):

    ###Test para verificar que se ordene array de forma  ascendente###
    def test_selection(self):
        original_list = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
        sorted_list = sorted(original_list)
        selection_sort(original_list, ascending=True)
        self.assertEqual(original_list, sorted_list)
    
    ###Test para verificar que se ordene array de forma  descendente###
    def test_descending_order(self):
        original_list = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
        sorted_list = sorted(original_list, reverse=True)
        selection_sort(original_list, ascending=False)
        self.assertEqual(original_list, sorted_list)

if __name__ == '__main__':
    unittest.main()
