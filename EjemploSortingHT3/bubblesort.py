def bubble_sort(arr):
    n = len(arr)

    for i in range(n):
        # Últimos i elementos ya están en su lugar correcto
        for j in range(0, n-i-1):
            # Intercambiar si el elemento encontrado es mayor que el siguiente elemento
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Ejemplo de uso
if __name__ == "__main__":
    # Lista de ejemplo
    ejemplo_lista = [64, 34, 25, 12, 22, 11, 90]

    # Llamada a la función bubble_sort
    bubble_sort(ejemplo_lista)

    # Imprimir la lista ordenada
    print("Lista ordenada:")
    print(ejemplo_lista)