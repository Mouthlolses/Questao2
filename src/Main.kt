fun main() {
    val inputString = "Exemplo de string com letras A e a"

    // Verifica se a letra 'a' ou 'A' está presente
    val containsA = inputString.any { it == 'a' || it == 'A' }

    // Conta a quantidade de vezes que a letra 'a' ou 'A' aparece
    val countA = inputString.count { it == 'a' || it == 'A' }

    if (containsA) {
        println("A letra 'a' (maiúscula ou minúscula) está presente.")
        println("Ela aparece $countA vezes.")
    } else {
        println("A letra 'a' (maiúscula ou minúscula) não está presente.")
    }
}