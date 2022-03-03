package linkedList

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class LinkedListTest {

    @Test
    @DisplayName("Should find the right size of the linked list")
    fun testSize() {
        val list = LinkedList<Int>()

        assertEquals(list.isEmpty(), true)

    }

    @Test
    @DisplayName("Should add an element at the beginning of the array")
    fun pushMethodTest() {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)

        assertEquals(list.head?.value, 2)
        assertEquals(list.tail?.value, 3)
    }

    @Test
    @DisplayName("Should add an element at the end of a empty list")
    fun appendMethodTestEmptyList() {
        val list = LinkedList<Int>()
        list.append(3)

        assertEquals(list.tail?.value, 3)
        assertEquals(list.head?.value, 3)
    }

    @Test
    @DisplayName("Should add an element at the end of a list")
    fun appendMethodTest() {
        val list = LinkedList<Int>()
        list.push(2)
        list.append(3)

        assertEquals(list.tail?.value, 3)
        assertEquals(list.head?.value, 2)
    }

    @Test
    @DisplayName("Should return the node at the specified index")
    fun nodeAtMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)

        val node = list.nodeAt(3)
        assertEquals(node?.value, null)
    }

    @Test
    @DisplayName("Should add an element at a specific location of the list")
    fun insertAtMethodTest() {
        val list = LinkedList<Int>()
        list.push(1)
        list.push(2)
        list.push(3)
        list.push(4)
        list.push(5)

        list.insertAt(3, 10)

        val node = list.nodeAt(3)
        assertEquals(node?.value, 10)
        assertEquals(node?.next?.value, 2)
    }

    
}