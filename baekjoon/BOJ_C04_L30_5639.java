    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class BOJ_C04_L30_5639 {
        static class Node {
            int n;
            Node left, right;

            Node(int n) {
                this.n = n;
            }

            void insert(int n) {
                if(n < this.n) {
                    if(this.left == null)
                        this.left = new Node(n);
                    else this.left.insert(n);
                }
                else {
                    if(this.right == null)
                        this.right = new Node(n);
                    else this.right.insert(n);
                }
            }
        }
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Node root = new Node(Integer.parseInt(br.readLine()));
            String input = "";
            while (true) {
                input = br.readLine();
                if (input == null || input.equals(""))
                    break;
                root.insert(Integer.parseInt(input));
            }
            search(root);
            System.out.println(sb);
        }

        static StringBuilder sb = new StringBuilder();

        public static void search(Node node) {
            if(node == null)
                return;
            search(node.left);
            search(node.right);
            sb.append(node.n).append("\n");
        }
    }
