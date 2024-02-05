'''
Se pregunto a AI:
    Puedes crear un código donde ordene hasta 3000 números al azar, todos enteros de 0 a 1000, con Selection Sort en python?
    Puedes hacer que el usuario pueda elegir si lo quiere ordenar ascendente o descendentemente en este mismo código
    Hola! puedes guardar los números generados en el código anterior en un arreglo?
'''
import random

def selection_sort(arr, ascending=True):
    n = len(arr)

    for i in range(n):
        # Encontrar el índice extremo en el resto de la lista
        extreme_index = i
        for j in range(i+1, n):
            if ascending:
                condition = arr[j] < arr[extreme_index]
            else:
                condition = arr[j] > arr[extreme_index]

            if condition:
                extreme_index = j

        # Intercambiar el elemento extremo encontrado con el primer elemento no ordenado
        arr[i], arr[extreme_index] = arr[extreme_index], arr[i]

# Generar una lista de 3000 números al azar en el rango de 0 a 1000 y guardarlos en un arreglo
random_numbers = [random.randint(0, 1000) for _ in range(3000)]

print("Lista original:")
print(random_numbers)

# Copiar la lista original para tener una referencia antes de la ordenación
original_copy = random_numbers.copy()

# Permitir al usuario elegir la dirección de la ordenación
order_choice = input("\n¿Quieres ordenar la lista ascendente (A) o descendentemente (D)? ").upper()

# Validar la elección del usuario
if order_choice == 'A':
    selection_sort(random_numbers, ascending=True)
    print("\nLista ordenada de forma ascendente:")
elif order_choice == 'D':
    selection_sort(random_numbers, ascending=False)
    print("\nLista ordenada de forma descendente:")
else:
    print("\nOpción no válida. Se ordenará de forma ascendente por defecto.")

print(random_numbers)

# Mostrar la lista original para comparar
#print("\nLista original (sin modificar):")
#print(original_copy)
