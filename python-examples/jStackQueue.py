#
# Created by Jagannathan Asokan
#

class Stack:
   # stack backed by python list
   def __init__(self):
      self.l = []

   def push(self, elem):
      self.l.append(elem)

   def pop(self):
      return self.l.pop()

   def size(self):
      return len(self.l)

class Queue:
   # queue backed by stacks
   def __init__(self):
      self.push_stack = Stack()
      self.pop_stack = Stack()

   def enque(self, elem):
      if self.push_stack.size() == 0 and self.pop_stack.size() > 0:
         # not first enque...
         # ...so transfer elements from pop_stack to push_stack...
         # ...to restore enqueue order
         for i in range(self.pop_stack.size()):
            self.push_stack.push(self.pop_stack.pop())
      self.push_stack.push(elem)
      print("enqued ", elem)

   def deque(self):
      if self.pop_stack.size() == 0 and self.push_stack.size() > 0:
         # not first deque...
         # ...so transfer elements from push_stack to pop_stack...
         # ...to restore dequeue order
         for i in range(self.push_stack.size()):
            self.pop_stack.push(self.push_stack.pop())
      elem = self.pop_stack.pop()
      print("dequed ", elem)
      return elem

   def show(self):
      print("push stack", self.push_stack.l)
      print("pop stack", self.pop_stack.l)
      print("\n")

q = Queue()
print("enqueing elements")
q.enque(1)
q.show()
q.enque(2)
q.show()
q.enque(3)
q.show()
print("dequeing elements")
q.deque()
q.show()
q.deque()
q.show()
print("enqueing elements")
q.enque(4)
q.show()
q.enque(5)
q.show()
print("dequeing elements")
q.deque()
q.show()
q.deque()
q.show()
q.deque()
q.show()
