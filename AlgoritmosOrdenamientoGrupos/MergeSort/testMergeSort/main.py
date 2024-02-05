def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        merge_sort(left_half)
        merge_sort(right_half)

        i = j = k = 0

        # Comparación y fusión de las dos mitades ordenadas
        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        # Verificar elementos restantes en ambas mitades
        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

    return arr

# Ejemplo de uso del algoritmo de Merge Sort
data_to_sort = [8, 3, 1, 7, 0, 10, 4]
data_to_sort_copy = list(data_to_sort)  # Crear una copia de la lista original
sorted_data = merge_sort(data_to_sort_copy)
print("Lista Original:", data_to_sort)
print("Lista Ordenada:", sorted_data)