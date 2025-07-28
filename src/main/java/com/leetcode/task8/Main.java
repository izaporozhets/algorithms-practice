package com.leetcode.task8;

public class Main {
    public static void main(String[] args) {
        ImageResource resource = createImageResource();
        resource.render();
    }

    private static ImageResource createImageResource() {
        return new ImageResource() {
            public void render() {
                if (this.isReady()) {
                    System.out.println("Rendering the ready image");
                } else {
                    System.out.println("Rendering the error text");
                }

            }
        };
    }

    private static class ImageResource {
        private ImageResource() {
        }

        public void render() {
            System.out.println("Rendering the image");
        }

        public boolean isReady() {
            return Math.random() > (double)0.5F;
        }
    }
}