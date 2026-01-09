#include <stdio.h>
#include <stdlib.h>

// Define the node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed\n");
        return NULL;
    }
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Function to insert at the end
void insert(struct Node** head) {
    int value;
    printf("Enter value to insert: ");
    scanf("%d", &value);

    struct Node* newNode = createNode(value);
    if (*head == NULL) {
        *head = newNode;
    } else {
        struct Node* temp = *head;
        while (temp->next != NULL)
            temp = temp->next;
        temp->next = newNode;
    }
    printf("Node inserted successfully.\n");
}

// Function to traverse and print the list
void traverse(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    printf("Linked List: ");
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to delete a node by value
void deleteNode(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty. Nothing to delete.\n");
        return;
    }

    int value;
    printf("Enter value to delete: ");
    scanf("%d", &value);

    struct Node *temp = *head, *prev = NULL;

    // If head node is to be deleted
    if (temp != NULL && temp->data == value) {
        *head = temp->next;
        free(temp);
        printf("Node deleted successfully.\n");
        return;
    }

    // Search for the node to be deleted
    while (temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }

    // If not found
    if (temp == NULL) {
        printf("Value not found in the list.\n");
        return;
    }

    // Unlink the node and free memory
    prev->next = temp->next;
    free(temp);
    printf("Node deleted successfully.\n");
}

int main() {
    struct Node* head = NULL;
    int choice;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Insert\n");
        printf("2. Traverse\n");
        printf("3. Delete\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                insert(&head);
                break;
            case 2:
                traverse(head);
                break;
            case 3:
                deleteNode(&head);
                break;
            case 4: 
                printf("Exiting program.\n");
                // Free all nodes before exit
                while (head != NULL) {
                    struct Node* temp = head;
                    head = head->next;
                    free(temp);
                }
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}
