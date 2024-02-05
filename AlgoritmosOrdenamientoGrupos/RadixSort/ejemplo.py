def countingSort(array, place):
    size = len(array)
    output = [0] * size
    count = [0] * 10

    for i in range(0, size):
        index = array[i] // place
        count[index % 10] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = size - 1
    while i >= 0:
        index = array[i] // place
        output[count[index % 10] - 1] = array[i]
        count[index % 10] -= 1
        i -= 1

    for i in range(0, size):
        array[i] = output[i]


def radixSort(array):
    max_element = max(array)

    place = 1
    while max_element // place > 0:
        countingSort(array, place)
        place *= 10


data = [121, 432, 564, 23, 1, 45, 788]
radixSort(data)
print(data)

class TestRadixSort(unittest.TestCase):
    def test_radixSort_sorted(self):
        data1 = [1, 2, 3, 4, 5]
        radixSort(data1)
        self.assertEqual(data1, [1, 2, 3, 4, 5])

    def test_radixSort_reversed(self):
        data2 = [5, 4, 3, 2, 1]
        radixSort(data2)
        self.assertEqual(data2, [1, 2, 3, 4, 5])

    def test_radixSort_duplicates(self):
        data3 = [3, 1, 2, 1, 3, 2, 3]
        radixSort(data3)
        self.assertEqual(data3, [1, 1, 2, 2, 3, 3, 3])

    def test_radixSort_negative_numbers(self):
        data4 = [-5, -3, -2, -4, -1]
        radixSort(data4)
        self.assertEqual(data4, [-5, -4, -3, -2, -1])

    def test_radixSort_large_numbers(self):
        data5 = [10000, 9999, 10001]
        radixSort(data5)
        self.assertEqual(data5, [9999, 10000, 10001])

    def test_radixSort_empty_array(self):
        data6 = []
        radixSort(data6)
        self.assertEqual(data6, [])
